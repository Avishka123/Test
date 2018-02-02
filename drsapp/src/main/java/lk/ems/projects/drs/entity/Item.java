package lk.ems.projects.drs.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.ws.rs.core.MediaType;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.CascadeType;
import org.hibernate.envers.Audited;


@Audited
@Entity
@Table(name="item")
public class Item extends BaseDomain{

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id = 0;
	
	@Column(name = "item_image")
	private List<Byte[]> images;
	
	@Column(name = "name_english")
	private String name = StringUtils.EMPTY;
	
	@OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
	@JoinColumn(name = "categorey_id", referencedColumnName = "id")
	private Categorey categorey;
	
	@OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
	@JoinColumn(name = "sub_categorey_id", referencedColumnName = "id")
	private SubCategorey subCategorey;
	
	@OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
	@JoinColumn(name = "colour_code_id", referencedColumnName = "id")
	private ColourCode colourCode;
	
	@Column(name = "item_price")
	private double price = 0.00;
	
	@Column(name = "description")
	private String description = StringUtils.EMPTY;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<Byte[]> getImages() {
		return images;
	}

	public void setImages(List<Byte[]> images) {
		this.images = images;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Categorey getCategorey() {
		return categorey;
	}

	public void setCategorey(Categorey categorey) {
		this.categorey = categorey;
	}

	public SubCategorey getSubCategorey() {
		return subCategorey;
	}

	public void setSubCategorey(SubCategorey subCategorey) {
		this.subCategorey = subCategorey;
	}

	public ColourCode getColourCode() {
		return colourCode;
	}

	public void setColourCode(ColourCode colourCode) {
		this.colourCode = colourCode;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}
}
