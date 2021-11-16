package dio.com.entities;

public class MySeries implements Comparable<MySeries> {
	
	private String name;
	private String genre;
	private Integer durantion;
	
	public MySeries(String name, String genre, Integer durantion) {
		this.name = name;
		this.genre = genre;
		this.durantion = durantion;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Integer getDurantion() {
		return durantion;
	}

	public void setDurantion(Integer durantion) {
		this.durantion = durantion;
	}

	@Override
	public String toString() {
		return "MySeries [name=" + name + ", genre=" + genre + ", durantion=" + durantion + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MySeries other = (MySeries) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(MySeries serie) {
		int duration = Integer.compare(this.getDurantion(), serie.getDurantion());
		if(duration != 0) {
			return duration;
		}
		return this.getGenre().compareTo(serie.getGenre());
		
	}
	
	

}
