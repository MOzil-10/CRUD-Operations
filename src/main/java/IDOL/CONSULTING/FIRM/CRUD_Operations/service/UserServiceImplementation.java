package IDOL.CONSULTING.FIRM.CRUD_Operations.service;

import IDOL.CONSULTING.FIRM.CRUD_Operations.dto.UserDto;
import IDOL.CONSULTING.FIRM.CRUD_Operations.exception.UserNotFoundException;
import IDOL.CONSULTING.FIRM.CRUD_Operations.mapper.UserMapper;
import IDOL.CONSULTING.FIRM.CRUD_Operations.model.User;
import IDOL.CONSULTING.FIRM.CRUD_Operations.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class UserServiceImplementation implements UserService {

    private final UserRepository userRepository;

    /**
     * Creates a new user.
     *
     * @param userDto the user DTO containing user details
     * @return the created user DTO
     */
    @Override
    public UserDto createUSer(UserDto userDto) {

        User user = UserMapper.mapToUser(userDto);
        User createdUser = userRepository.save(user);

        return UserMapper.mapToUserDto(createdUser);
    }

    /**
     * Retrieves a user by their ID.
     *
     * @param userId the ID of the user to retrieve
     * @return the retrieved user DTO
     * @throws UserNotFoundException if the user with the specified ID is not found
     */
    @Override
    public UserDto getUserById(Long userId) {

        User user = userRepository.findById(userId)
                .orElseThrow(()-> new UserNotFoundException("User with ID: " + userId + " does not exist."));
        return UserMapper.mapToUserDto(user);
    }

    /**
     * Retrieves all users.
     *
     * @return a list of user DTOs
     */
    @Override
    public List<UserDto> getAllUsers() {
        List<User> users = userRepository.findAll();
        return users.stream().map((user -> UserMapper.mapToUserDto(user)))
                .collect(Collectors.toList());

    }

    /**
     * Updates an existing user.
     *
     * @param userId the ID of the user to update
     * @param newUserDetails the new user details
     * @return the updated user DTO
     * @throws UserNotFoundException if the user with the specified ID is not found
     */
    @Override
    public UserDto updateUser(Long userId, UserDto newUserDetails) {

       User user = userRepository.findById(userId)
                .orElseThrow(()-> new UserNotFoundException("User with ID: " + userId + " does not exist."));

       user.setFirstName(newUserDetails.getFirstName());
       user.setLastName(newUserDetails.getLastName());
       user.setContactNumber(newUserDetails.getContactNumber());

       User updatedUserDetails = userRepository.save(user);
        return UserMapper.mapToUserDto(updatedUserDetails);
    }

    /**
     * Deletes a user by their ID.
     *
     * @param userId the ID of the user to delete
     * @throws UserNotFoundException if the user with the specified ID is not found
     */
    @Override
    public void deleteUser(Long userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new UserNotFoundException("User with ID: " + userId + " does not exist."));

        userRepository.deleteById(userId);
    }
}
