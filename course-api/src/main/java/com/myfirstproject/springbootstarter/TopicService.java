package com.myfirstproject.springbootstarter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics= new ArrayList<>(Arrays.asList(
			new Topic("1","Kruthika","muddu" ),
			new Topic("2","Gokul","appu" ),
			new Topic("3","Love","mudduNappu")
				));
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getID().equals(id)).findFirst().get();
	}
	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(Topic topic,String id) {
		for(int i = 0;i<topics.size();i++) {
			Topic t = topics.get(i);
			if(t.getID().equals(id)){
				topics.set(i,topic);
				return;
			}
		}
		
	}

	public void deleteTopic(String id) {
		topics.removeIf(t -> t.getID().equals(id));
	}
	 
}
 