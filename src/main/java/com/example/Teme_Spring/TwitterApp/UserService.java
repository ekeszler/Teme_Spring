package com.example.Teme_Spring.TwitterApp;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    UserRepository userRepository;

    TweetRepository tweetRepository;

    public UserService(UserRepository userRepository, TweetRepository tweetRepository) {
        this.userRepository = userRepository;
        this.tweetRepository = tweetRepository;
    }

    public User saveUser (User user){
        return userRepository.save(user);
    }


    @Transactional
    public User findUserById(Long userId) throws Exception{
        User user = userRepository.findById(userId).orElseThrow(() -> new Exception("user not found"));
        return user;
    }

//    @Transactional
//    public User addTweetToUser(Long userID, Tweet tweet){
//        User user = userRepository.findById(userID).orElseThrow(() -> new Exception("user not found"));
//        tweet.setUser(user);
//        user.getTweets().add(tweet);
//        return userRepository.save(user);
//    }

//    @Transactional
//    public User deleteAllTweetsFromUser(Long userId) throws Exception{
//        tweetRepository.deleteAllByUser_Id(userId);
//    }
}
