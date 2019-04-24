package lambdas.j8functional.entity;

import java.util.ArrayList;
import java.util.List;

public class Artist {

    private String name;

    private List<String> members = new ArrayList<>();

    private String origin;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +
                ", members=" + members +
                ", origin='" + origin + '\'' +
                '}';
    }

    public void addMember(String name) {
        this.members.add(name);
    }


}
