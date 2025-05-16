package Streams;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGrouping {
    public static void main(String[] argss) {
        List<String> str = Arrays.asList("praveen", "bk", "rrr", "mb");
        Map<Integer, List<String>> strM = str.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(strM);


    }
}
