package com.cat.springbootStarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics= new ArrayList<>(Arrays.asList(new Topic("spring","SpringFramework","SpringFramework Description"),
			 new Topic("Java","core java","core java Description"),
			 new Topic("JavaScript","Java Script","Java Script Description")));
	
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id){
				
		for(Topic topic:topics) {
			
			if (topic.getId().equalsIgnoreCase(id)) {
				
				return topic;
			}
		}
		return null;
		
					
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
		 
	}

	public void updateTopic(String id, Topic topic) {
		
		for(int i=0 ; i<topics.size();i++) {
			
			Topic t=topics.get(i);
			if(t.getId().equalsIgnoreCase(id)) {
				topics.set(i, topic);
				return;
			}
			
		}
		
	}

}
