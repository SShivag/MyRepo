import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class XYZ {
    public static void main(String[] args) {


        List<String> input = Arrays.asList("DTCC-test", "NSCC-test", "DTCC1-DTCC");

        List<String> result = input.stream().map(s -> s.split("-")[0]).collect(Collectors.toList());
        System.out.println(result);
    }
}
