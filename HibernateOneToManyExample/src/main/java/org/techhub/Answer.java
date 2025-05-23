package org.techhub;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
public class Answer
{
 
	@Id
	@Column(name="answer_ID")
  private int answerId;
  private String answer;
  
@ManyToOne
  private Question question;
  
public int getAnswerId() {
	return answerId;
}
public void setAnswerId(int answerId) {
	this.answerId = answerId;
}
public String getAnswer() {
	return answer;
}
public void setAnswer(String answer) {
	this.answer = answer;
}

public Question getQuestion() {
	return question;
}
public void setQuestion(Question question) {
	this.question = question;
}
public Answer() {
	super();

}
  
  
}
