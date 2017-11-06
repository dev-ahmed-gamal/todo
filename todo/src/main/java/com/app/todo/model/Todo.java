package com.app.todo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

//@Embeddable
@Entity
@Table(name = "todo")
@EnableAutoConfiguration
public class Todo {
	@javax.persistence.Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Column(name="todo_id")
  private Long id;

  @Column
  @NotBlank
  @Size(max=100)
  private String title;

  @Column
  private String status;

  @Column
  private Boolean completed = false;

  @Column
  private Date createdAt = new Date();

  public Todo() {
      super();
  }

  public Todo(String title) {
      this.title = title;
  }

  public Long getId() {
      return id;
  }

  public void setId(Long id) {
      this.id = id;
  }

  public String getTitle() {
      return title;
  }

  public void setTitle(String title) {
      this.title = title;
  }

  public Boolean getCompleted() {
      return completed;
  }

  public void setCompleted(Boolean completed) {
      this.completed = completed;
  }

  public Date getCreatedAt() {
      return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
      this.createdAt = createdAt;
  }

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


}