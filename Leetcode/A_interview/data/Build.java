    package A_interview.data;

import java.util.ArrayList;
import java.util.List;

public class Build {
  private String name;
  private GAV gav;
  private List<GAV> dependencies;

  public Build(String name, GAV gav, List<GAV> dependencies) {
      this.name = name;
      this.gav = gav;
      this.dependencies = dependencies;
  }

//transfer the dependencies into a list of string
  public List<String> stringifyDependencies() {
    List<String> l = new ArrayList<>();
    for (GAV g : dependencies) {
        l.add(g.stringify());
    }
    return l;
  }

  public String name() {
      return this.name;
  }

  public String stringifyGAV() {
      return gav.stringify();
  }

  public void updateDependencies(List<GAV> l) {
    this.dependencies = l;
  }
}
