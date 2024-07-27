package julio.edu.dio.service.impl;

import julio.edu.dio.domain.model.User;
import julio.edu.dio.domain.repository.UserRepository;
import julio.edu.dio.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Supplier;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new NoSuchElementException("User not found by id = " + id));
    }

    @Override
    public User create(User userToCreate) {

        if (userRepository.findById(userToCreate.getId()).isPresent()) {
            throw new IllegalArgumentException("This User ID already exists");
        }
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("This account number is already in use");
        }
        if (userRepository.existsByCardNumber(userToCreate.getCard().getNumber())) {
            throw new IllegalArgumentException("This card number is already in use");
        }

        return userRepository.save(userToCreate);
    }
}
