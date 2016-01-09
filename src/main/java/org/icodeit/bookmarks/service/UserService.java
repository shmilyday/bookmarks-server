package org.icodeit.bookmarks.service;

import org.icodeit.bookmarks.model.Feed;
import org.icodeit.bookmarks.model.User;
import org.icodeit.bookmarks.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Iterable<Feed> favoriteFeeds(Long userId) {
        User user = userRepository.findOne(userId);

        if(user != null) {
            return user.getFavoriteFeeds();
        }

        return new ArrayList<>();
    }
}
