package IDOL.CONSULTING.FIRM.CRUD_Operations.dto;

import jakarta.validation.constraints.NotEmpty;
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
    @NotEmpty(message = "First name must not be empty")
    private String firstName;

    @NotEmpty(message = "Last name must not be empty")
    private String lastName;

    @NotEmpty(message = "Contact number must not be empty")
    private String contactNumber;
}
