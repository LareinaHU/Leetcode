package A_interview.data.company.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import A_interview.data.Build;
import A_interview.data.GAV;

public class CRUDService {
    //retrieve
    public Build getBuild(String name) {
        readLock.lock();
        try {
            return builds.get(name);
        } finally {
            readLock.unlock();
        }
    }

    public void storeBuild(Build b) {
        // update_or_add semantic
        writeLock.lock();
        //Build current = b;
        //if b is in in the builds, we do the update thing, update its gav
        Build current = builds.get(b.name()); //get the current build in the builds
        //not empty, we need to update the gav
        if (current != null) {
            builds.remove(current.stringifyGAV());
        }
        //otherwise: we put the new b (name and gav) into the builds
        builds.put(b.name(), b);
        builds.put(b.stringifyGAV(), b);
        writeLock.unlock();
    }

    public void updateDependency(String buildName, List<GAV> newDependencies) {
        // assuming build already exists
        writeLock.lock();
        Build currentBuild = builds.get(buildName);
        currentBuild.updateDependencies(newDependencies);
        writeLock.unlock();
    }

    public List<String> findBuildOrder(String name) {
        readLock.lock();
        //update
       // Map<String, Build> mapCopy = new Map<>(builds);
      //  readLock.unlock();

        try {
            LinkedHashSet<String> rs = new LinkedHashSet<>();
            recur(rs, builds.get(name));
            List<String> l = new ArrayList<>(rs.size());
            for (String s : rs) {
                l.add(s);
            }
            return l;
        } finally {
            readLock.unlock();
        }
    }

    private void recur(LinkedHashSet<String> result, Build currentBuild) {
        if (result.contains(currentBuild.name())) {
            // added 
            return;
        }

        List<String> dependencies = currentBuild.stringifyDependencies();
        if (dependencies.isEmpty()) {
            // no dependency, just add it.
            result.add(currentBuild.name());
            return;
        }

        for (String dependency : dependencies) {
            // find all denpendencies and add to result
            recur(result, builds.get(dependency));
        }

        // with dependencies all added we can add current one to result as well
        result.add(currentBuild.name());
    }

        // <name or Stringified GAV, Build>
        // If simple stringify is not a good enough idea for conflicting
        // keys(I hope not), we can still use hashed GAV as key
    private HashMap<String, Build> builds;
    // assuming read heavy
    // if write heavy we could use only write lock 
    // and copy the map on look up
    private ReentrantReadWriteLock lock;
    private Lock readLock = lock.readLock();
    private Lock writeLock = lock.writeLock();
            }


//ReenTrantReadWriteLock: allow multi-thread r.
// It don't allow multi-thread w or multi-thread w/r