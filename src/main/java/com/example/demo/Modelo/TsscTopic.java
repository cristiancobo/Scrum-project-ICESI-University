package com.example.demo.Modelo;


import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.Min;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Validated.TopicValidated;
import com.fasterxml.jackson.annotation.JsonIgnore;




/**
 * The persistent class for the TSSC_TOPIC database table.
 * 
 */
@Entity
@Table(name = "TSSC_TOPIC")
@NamedQuery(name = "TsscTopic.findAll", query = "SELECT t FROM TsscTopic t")
public class TsscTopic implements Serializable {
	public List<TsscTimecontrol> getTimelines() {
		return timelines;
	}

	public void setTimelines(List<TsscTimecontrol> timelines) {
		this.timelines = timelines;
	}

	private static final long serialVersionUID = 1L;
	
	
	
	/*
	 * dependency injections
	 * _________________________________________________
	 */
	
	private TsscStory tsscStory;
	@Autowired
	public void injectionTsscStoryBean(TsscStory tsscStory) {
		this.tsscStory = tsscStory;
	}
	
	private TsscTimeInterval tsscTimeInterval;
	@Autowired
	public void injectionTsscTimeIntervalBean(TsscTimeInterval tsscTimeInterval) {
		this.tsscTimeInterval = tsscTimeInterval;
	}
	/*
	 * _________________________________________________
	 */
	

	@Id
	@SequenceGenerator(name = "TSSC_TOPIC_ID_GENERATOR", allocationSize = 1, sequenceName = "TSSC_TOPIC_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TSSC_TOPIC_ID_GENERATOR")
	private long id;

	private String description;

	private String name;
	@Min(value = 1, message = "The sprints must to be greater than zero", groups=TopicValidated.class)
	@Column(name = "DEFAULT_SPRINTS")
	private long defaultSprints;
	@Min(value = 1, message = "The groups must to be greater than zero", groups=TopicValidated.class)
	@Column(name = "DEFAULT_GROUPS")
	private long defaultGroups;
	@Min(value = 1, message = "The prefix is empty", groups=TopicValidated.class)
	@Column(name = "GROUP_PREFIX")
	private String groupPrefix;

	// bi-directional many-to-one association to TsscStory
	@OneToMany(mappedBy = "tsscTopic")
	@Fetch(FetchMode.JOIN)
	@JsonIgnore
	private List<TsscGame> tsscGames;

	// bi-directional many-to-one association to TsscStory
	@OneToMany(mappedBy = "tsscTopic")
	@JsonIgnore
	private List<TsscStory> tsscStories;
	
	@OneToMany(mappedBy = "tsscTopic")
	@JsonIgnore
	private List<TsscTimecontrol> timelines;

	/*
	 * Falta agregar relación.
	 */
	
	
	public TsscTopic() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getDefaultSprints() {
		return defaultSprints;
	}

	public void setDefaultSprints(long defaultSprints) {
		this.defaultSprints = defaultSprints;
	}

	public long getDefaultGroups() {
		return defaultGroups;
	}

	public void setDefaultGroups(long defaultGroups) {
		this.defaultGroups = defaultGroups;
	}

	public String getGroupPrefix() {
		return groupPrefix;
	}

	public void setGroupPrefix(String groupPrefix) {
		this.groupPrefix = groupPrefix;
	}
	
	/*
	 * ________________________ new methods implemented __________________________
	 */
	
	public List<TsscGame> getTsscGames(){
		return this.tsscGames;
	}
	public void setTsscGames(List<TsscGame> tsscGames) {
		this.tsscGames = tsscGames;
	}
	
	/*
	 * ___________________________________________________________________________
	 */

	public List<TsscStory> getTsscStories() {
		return this.tsscStories;
	}

	public void setTsscStories(List<TsscStory> tsscStories) {
		this.tsscStories = tsscStories;
	}

	public TsscStory addTsscStory(TsscStory tsscStory) {
		getTsscStories().add(tsscStory);
		tsscStory.setTsscTopic(this);

		return tsscStory;
	}

	public TsscStory removeTsscStory(TsscStory tsscStory) {
		getTsscStories().remove(tsscStory);
		tsscStory.setTsscTopic(null);

		return tsscStory;
	}
}