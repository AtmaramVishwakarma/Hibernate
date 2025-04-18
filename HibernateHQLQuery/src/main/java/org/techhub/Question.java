package org.techhub;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Question
{
  
	@Id
	@Column(name="question_ID")
  private int questionId;
  private String question;

  @OneToMany(mappedBy = "question") // here we not use mapped by then one extra table is created in database 
  private List<Answer> answers;
 
public Question() {
	super();

}
public Question(int questionId, String question) {
	super();
	this.questionId = questionId;
	this.question = question;
	
}
public Question(int questionId, String question, List<Answer> answers) {
	super();
	this.questionId = questionId;
	this.question = question;
	this.answers = answers;
}
public int getQuestionId() {
	return questionId;
}
public void setQuestionId(int questionId) {
	this.questionId = questionId;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}

public List<Answer> getAnswers() {
	return answers;
}
public void setAnswers(List<Answer> answers) {
	this.answers = answers;
}


 
}
