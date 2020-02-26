package lawsuitsapp.lawsuits.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Employee {

    int ID;

    String firstName;
    String lastName;
    String username;
    String password;
    String role;

    // connections
    List<Case> cases;
    List<Document> documents;
    Credentials credentials;

}
