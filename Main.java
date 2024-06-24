import java.util.ArrayList;
import java.util.List;

public class Main {

    public String shortestPath(List<List<String>> input){
        List<String> hasPath = new ArrayList<>();
        String missingPath = "";

        //All first elements have a path
        for (int i = 0; i< input.size(); i++){
            List<String> path =  input.get(i);
            hasPath.add(path.get(0));
        }

        //find one missing a path
        for (int i = 0; i< input.size(); i++){
            List<String> path =  input.get(i);

            for(int j = 0; j< path.size(); j++){
                if(!hasPath.contains(path.get(j))){
                    missingPath += path.get(j);
                }
            }
        }

        return missingPath;

    }
    public  void main(String[] args) {
        List<List<String>> input = new ArrayList<>();
        List<String>  path1 = new ArrayList<>();
        path1.add("Nairobi");
        path1.add("Kisumu");
        List<String>  path2 = new ArrayList<>();
        path2.add("Nairobi");
        path2.add("Kisumu");
        List<String>  path3 = new ArrayList<>();
        path3.add("Nairobi");
        path3.add("Kisumu");
        input.add(path1);
        input.add(path2);
        input.add(path3);
        System.out.println(shortestPath(input));

    }
}