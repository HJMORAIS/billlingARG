/**
 * 
 */
package domain.enums;

/**
 * The Enum DomainStatusEnum.
 *
 * @author hernan
 */
public enum DomainStatusEnum {

	/**
	 * The active. El estado del objeto es activo, quiere decir que esta
	 * disponible para su uso.
	 */
	ACTIVE(0),

	/**
	 * The deleted. El estado del objeto es borrado, quiere decir que NO esta
	 * disponible para su uso, si para su consulta.
	 */
	DELETED(1);

	/** The code. */
	private Integer code;

	/**
	 * Instantiates a new domain enum.
	 *
	 * @param code
	 *            the code
	 */
	DomainStatusEnum(Integer code) {
		this.code = code;
	}

	/**
	 * Gets the code.
	 *
	 * @return the code
	 */
	public Integer getCode() {
		return this.code;
	}
}
