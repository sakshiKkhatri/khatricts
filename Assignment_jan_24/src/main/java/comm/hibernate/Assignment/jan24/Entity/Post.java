package comm.hibernate.Assignment.jan24.Entity;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table( name = "Post")
public class Post {
     
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String postid;
	private String postedby;
    private LocalDateTime createDateTime;
    
	private String imageurl;
@OneToMany(mappedBy = "post", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
@JoinColumn(name = "comment_id")
	
	
private Comment  comment;

	public Post(String postid, String postedby, String imageurl, LocalDateTime createDateTime) {
		super();
		this.postid = postid;
		this.postedby = postedby;
		this.createDateTime = createDateTime;
		this.imageurl = imageurl;
	}

	/**
	 * @return the postid
	 */
	public String getPostid() {
		return postid;
	}

	/**
	 * @param postid the postid to set
	 */
	public void setPostid(String postid) {
		this.postid = postid;
	}

	/**
	 * @return the postedby
	 */
	public String getPostedby() {
		return postedby;
	}

	/**
	 * @param postedby the postedby to set
	 */
	public void setPostedby(String postedby) {
		this.postedby = postedby;
	}

	/**
	 * @return the createDateTime
	 */
	public LocalDateTime getCreateDateTime() {
		return createDateTime;
	}

	/**
	 * @param createDateTime the createDateTime to set
	 */
	public void setCreateDateTime(LocalDateTime createDateTime) {
		this.createDateTime = createDateTime;
	}

	/**
	 * @return the imageurl
	 */
	public String getImageurl() {
		return imageurl;
	}

	/**
	 * @param imageurl the imageurl to set
	 */
	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	/**
	 * @return the comment
	 */
	public Comment getComment() {
		return comment;
	}

	

	/**
	 * @param comment the comment to set
	 */
	public void setComment(Comment comment) {
		this.comment = comment;
	}
	
	
	public Post() {
		super();
	}

}
