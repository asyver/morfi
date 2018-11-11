package no.syver.morfi.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Form {
  	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
	@OneToMany(mappedBy="form")
	private List<Page> pages = new ArrayList<>();
	
  	private String name;
    
    public Form() {
	}

    public Form(String name) {
    	this.name = name;
	}
    
	public Long getId() { 
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addPage(Page page) {
		this.pages.add(page);
	}

	public List<Page> getPages() {
		return pages;
	}

	public void setPages(List<Page> pages) {
		this.pages = pages;
	}
}