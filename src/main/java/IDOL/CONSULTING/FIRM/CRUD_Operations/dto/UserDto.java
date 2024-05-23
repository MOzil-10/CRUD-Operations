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

    /**
 * Represents a Data Transfer Object (DTO) for user information.
 * Used to transfer user data between client and server.
 */
    private long id;
    private String firstName;
    private String lastName;
    private String contactNumber;
}
