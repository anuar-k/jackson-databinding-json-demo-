import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Driver {
    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            Student student = objectMapper.readValue(new File("data/sample-full.json"), Student.class);
            System.out.println("First name: " + student.getFirstName());
            System.out.println("Last name" + student.getLastName());
            System.out.println(student);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}