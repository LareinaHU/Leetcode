package A_interview.data;

public class GAV {
  private String groupId;
  private String artifactId;
  private String version;

  public GAV(String groupId, String artifactId, String version) {
    this.groupId = groupId;
    this.artifactId = artifactId;
    this.version = version;
  }

//convenient
  public String stringify() {
      return groupId + "," + artifactId + "," + version;
  }
}

