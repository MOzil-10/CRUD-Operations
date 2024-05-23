package IDOL.CONSULTING.FIRM.CRUD_Operations.controller;

import IDOL.CONSULTING.FIRM.CRUD_Operations.dto.UserDto;
import IDOL.CONSULTING.FIRM.CRUD_Operations.service.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    /**
     * Creates a new user.
     *
     * @param userDto the user DTO containing user details
     * @return the created user DTO
     */
    @PostMapping("/addUser")
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto) {
        UserDto createdUser = userService.createUSer(userDto);

        return new ResponseEntity<>(createdUser, HttpStatus.OK);
    }

    /**
     * Retrieves a user by their ID.
     *
     * @param userId the ID of the user to retrieve
     * @return the retrieved user DTO
     */
    @GetMapping("/getUser/{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable("id") Long userId) {
        UserDto userDto = userService.getUserById(userId);
        return ResponseEntity.ok(userDto);
    }

    /**
     * Retrieves all users.
     *
     * @return a list of user DTOs
     */
    @GetMapping("/getAllUsers")
    public ResponseEntity<List<UserDto>> getAllUsers() {
        List<UserDto> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }

    /**
     * Updates an existing user.
     *
     * @param userId the ID of the user to update
     * @param newUserDetails the new user details
     * @return the updated user DTO
     */
    @PutMapping("/update/{id}")
    public ResponseEntity<UserDto> updateUser(@PathVariable("id") Long userId,@Valid @RequestBody UserDto newUserDetails) {
        UserDto userDto = userService.updateUser(userId, newUserDetails);
        return ResponseEntity.ok(userDto);
    }

    /**
     * Deletes a user by their ID.
     *
     * @param userId the ID of the user to delete
     * @return a message indicating the user was successfully deleted
     */
    @DeleteMapping("/deleteUser/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") Long userId) {
        userService.deleteUser(userId);
        return ResponseEntity.ok("User Successfully Deleted");
    }
}

