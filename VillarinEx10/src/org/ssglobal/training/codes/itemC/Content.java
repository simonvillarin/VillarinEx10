package org.ssglobal.training.codes.itemC;

import java.util.Date;

public sealed class Content permits Picture, PhotoAlbum, Movie{	
	private Date timeAdded;

	public Date getTimeAdded() {
		return timeAdded;
	}

	public void setTimeAdded(Date timeAdded) {
		this.timeAdded = timeAdded;
	}	
}
