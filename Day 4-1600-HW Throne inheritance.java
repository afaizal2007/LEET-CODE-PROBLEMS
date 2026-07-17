import java.util.*;
class ThroneInheritance {
    private Map<String, List<String>> familyTree;
    private Set<String> deadMembers;
    private String king;
    public ThroneInheritance(String kingName) {
        this.familyTree = new HashMap<>();
        this.deadMembers = new HashSet<>();
        this.king = kingName;
        this.familyTree.put(kingName, new ArrayList<>());
    }
    public void birth(String parentName, String childName) {
        this.familyTree.get(parentName).add(childName);
        this.familyTree.put(childName, new ArrayList<>());
    }
    public void death(String name) {
        this.deadMembers.add(name);
    }
    public List<String> getInheritanceOrder() {
        List<String> order = new ArrayList<>();
        dfs(king, order);
        return order;
    }
    private void dfs(String current, List<String> order) 
        if (!deadMembers.contains(current)) {
            order.add(current);
        }
        List<String> children = familyTree.get(current);
        if (children != null) {
            for (String child : children) {
                dfs(child, order);
            }
        }
    }
}
