/**
 * 
 */
package domain;

import java.util.Date;

import domain.enums.DomainStatusEnum;

// TODO: Auto-generated Javadoc
/**
 * The Class Domain.
 * 
 * Esta clase esa heredada por cada clase de dominio que deba persistirse en la
 * base de datos.
 *
 * @author hernan
 */
public class Domain {

	/** The id. Identificador del objeto en la base de datos. */
	private Long id;

	/** The create date. Fecha de creacion del objeto en la base de datos. */
	private Date createDate;

	/**
	 * The mod date. fecha de la ultima modificacion del objeto en la base de
	 * datos.
	 */
	private Date modDate;

	/** The delete date. Fecha de eliminacion del objeto en la base de datos. */
	private Date deleteDate;

	/**
	 * The status. Indica si el objeto esta disponible para su uso o si el mismo
	 * fue eliminado.
	 */
	private DomainStatusEnum status;

	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public DomainStatusEnum getStatus() {
		return status;
	}

	/**
	 * Sets the status.
	 *
	 * @param status
	 *            the new status
	 */
	public void setStatus(DomainStatusEnum status) {
		this.status = status;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *            the new id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Gets the creates the date.
	 *
	 * @return the creates the date
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * Sets the creates the date.
	 *
	 * @param createDate
	 *            the new creates the date
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/**
	 * Gets the mod date.
	 *
	 * @return the mod date
	 */
	public Date getModDate() {
		return modDate;
	}

	/**
	 * Sets the mod date.
	 *
	 * @param modDate
	 *            the new mod date
	 */
	public void setModDate(Date modDate) {
		this.modDate = modDate;
	}

	/**
	 * Gets the delete date.
	 *
	 * @return the delete date
	 */
	public Date getDeleteDate() {
		return deleteDate;
	}

	/**
	 * Sets the delete date.
	 *
	 * @param deleteDate
	 *            the new delete date
	 */
	public void setDeleteDate(Date deleteDate) {
		this.deleteDate = deleteDate;
	}

	/**
	 * Instantiates a new domain.
	 *
	 * @param id
	 *            the id
	 * @param createDate
	 *            the create date
	 * @param modDate
	 *            the mod date
	 * @param deleteDate
	 *            the delete date
	 */
	public Domain(Long id, Date createDate, Date modDate, Date deleteDate) {
		super();
		this.id = id;
		this.createDate = createDate;
		this.modDate = modDate;
		this.deleteDate = deleteDate;
	}

	/**
	 * Instantiates a new domain.
	 */
	public Domain() {
		super();
		this.id = null;
		this.createDate = null;
		this.modDate = null;
		this.deleteDate = null;
	}
}
