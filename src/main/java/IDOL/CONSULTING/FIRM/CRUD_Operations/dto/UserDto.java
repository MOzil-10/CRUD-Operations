package IDOL.CONSULTING.FIRM.CRUD_Operations.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    //we use this class to transfer the data between client and server

    private long id;
    private String firstName;
    private String lastName;
    private String contactNumber;
}
