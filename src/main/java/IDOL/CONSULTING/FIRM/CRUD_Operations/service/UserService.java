package IDOL.CONSULTING.FIRM.CRUD_Operations.service;

import IDOL.CONSULTING.FIRM.CRUD_Operations.dto.UserDto;

import java.util.List;

public interface UserService {

    /**
     * Creates a new user.
     *
     * @param userDto the user DTO containing user details
     * @return the created user DTO
     */
    UserDto createUSer(UserDto userDto);

    /**
     * Retrieves a user by their ID.
     *
     * @param userId the ID of the user to retrieve
     * @return the retrieved user DTO
     */
    UserDto getUserById(Long userId);

    /**
     * Retrieves all users.
     *
     * @return a list of user DTOs
     */
    List<UserDto> getAllUsers();

    /**
     * Updates an existing user.
     *
     * @param userId the ID of the user to update
     * @param newUserDetails the new user details
     * @return the updated user DTO
     */
    UserDto updateUser(Long userId, UserDto newUserDetails);

    /**
     * Deletes a user by their ID.
     *
     * @param userId the ID of the user to delete
     */
    void deleteUser(Long userId);
}
