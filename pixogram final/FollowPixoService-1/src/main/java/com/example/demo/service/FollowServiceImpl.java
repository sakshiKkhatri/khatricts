package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Follow;
import com.example.demo.repository.FollowRepository;

@Service
public class FollowServiceImpl implements FollowService{

	@Autowired
	FollowRepository followRepository;

	@Override
	public Follow createFollower(Follow follow) {
		return followRepository.save(follow);
	}

	@Override
	public List<Follow> getFollowerByMyid(int myid) {
		return followRepository.getByMyid(myid);
	}

	public List<Follow> getFollowingByUserid() {
		return followRepository.getByUserid(null);
	}

	@Override
	public List<Follow> getFollowingByUserid(int userid) {
		// TODO Auto-generated method stub
		return null;
	}
}
