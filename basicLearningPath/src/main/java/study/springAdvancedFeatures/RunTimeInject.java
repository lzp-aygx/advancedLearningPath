package study.springAdvancedFeatures;

/**
 * Created by lizhupeng on 2017/3/20.
 */
public class RunTimeInject {
    private String projectName;
    private String author;
    private double versions;

    public RunTimeInject(String projectName, String author, double versions) {
        this.projectName = projectName;
        this.author = author;
        this.versions = versions;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getVersions() {
        return versions;
    }

    public void setVersions(float versions) {
        this.versions = versions;
    }

    @Override
    public String toString() {
        return "RunTimeInject{" +
                "projectName='" + projectName + '\'' +
                ", author='" + author + '\'' +
                ", versions=" + versions +
                '}';
    }
}
