package IDOL.CONSULTING.FIRM.CRUD_Operations.mapper;

import IDOL.CONSULTING.FIRM.CRUD_Operations.dto.UserDto;
import IDOL.CONSULTING.FIRM.CRUD_Operations.model.User;

public class UserMapper {

    /**
     * Maps a User entity to a UserDto.
     *
     * @param user the user entity to map
     * @return the mapped UserDto
     */
    public static UserDto mapToUserDto(User user) {
        return new UserDto(
         user.getId(),
         user.getFirstName(),
         user.getLastName(),
        user.getContactNumber()
        );
    }

    /**
     * Maps a UserDto to a User entity.
     *
     * @param userDto the user DTO to map
     * @return the mapped User entity
     */
    public static User mapToUser(UserDto userDto) {
        return new User(
                userDto.getId(),
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getContactNumber()
        );
    }
}
