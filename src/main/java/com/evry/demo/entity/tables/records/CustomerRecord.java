/**
 * This class is generated by jOOQ
 */
package com.evry.demo.entity.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.3"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CustomerRecord extends org.jooq.impl.UpdatableRecordImpl<com.evry.demo.entity.tables.records.CustomerRecord> implements org.jooq.Record7<java.math.BigInteger, java.sql.Timestamp, java.lang.Long, java.sql.Timestamp, java.lang.String, java.lang.String, java.sql.Timestamp> {

	private static final long serialVersionUID = 375387710;

	/**
	 * Setter for <code>PMTDATA.CUSTOMER.ID</code>.
	 */
	public void setId(java.math.BigInteger value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>PMTDATA.CUSTOMER.ID</code>.
	 */
	public java.math.BigInteger getId() {
		return (java.math.BigInteger) getValue(0);
	}

	/**
	 * Setter for <code>PMTDATA.CUSTOMER.BIRTH_DATE</code>.
	 */
	public void setBirthDate(java.sql.Timestamp value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>PMTDATA.CUSTOMER.BIRTH_DATE</code>.
	 */
	public java.sql.Timestamp getBirthDate() {
		return (java.sql.Timestamp) getValue(1);
	}

	/**
	 * Setter for <code>PMTDATA.CUSTOMER.BIRTH_NR</code>.
	 */
	public void setBirthNr(java.lang.Long value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>PMTDATA.CUSTOMER.BIRTH_NR</code>.
	 */
	public java.lang.Long getBirthNr() {
		return (java.lang.Long) getValue(2);
	}

	/**
	 * Setter for <code>PMTDATA.CUSTOMER.CREATED_DATE</code>.
	 */
	public void setCreatedDate(java.sql.Timestamp value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>PMTDATA.CUSTOMER.CREATED_DATE</code>.
	 */
	public java.sql.Timestamp getCreatedDate() {
		return (java.sql.Timestamp) getValue(3);
	}

	/**
	 * Setter for <code>PMTDATA.CUSTOMER.FIRSTNAME</code>.
	 */
	public void setFirstname(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>PMTDATA.CUSTOMER.FIRSTNAME</code>.
	 */
	public java.lang.String getFirstname() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>PMTDATA.CUSTOMER.LASTNAME</code>.
	 */
	public void setLastname(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>PMTDATA.CUSTOMER.LASTNAME</code>.
	 */
	public java.lang.String getLastname() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>PMTDATA.CUSTOMER.UPDATED_DATE</code>.
	 */
	public void setUpdatedDate(java.sql.Timestamp value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>PMTDATA.CUSTOMER.UPDATED_DATE</code>.
	 */
	public java.sql.Timestamp getUpdatedDate() {
		return (java.sql.Timestamp) getValue(6);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.math.BigInteger> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.math.BigInteger, java.sql.Timestamp, java.lang.Long, java.sql.Timestamp, java.lang.String, java.lang.String, java.sql.Timestamp> fieldsRow() {
		return (org.jooq.Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.math.BigInteger, java.sql.Timestamp, java.lang.Long, java.sql.Timestamp, java.lang.String, java.lang.String, java.sql.Timestamp> valuesRow() {
		return (org.jooq.Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigInteger> field1() {
		return com.evry.demo.entity.tables.Customer.CUSTOMER.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field2() {
		return com.evry.demo.entity.tables.Customer.CUSTOMER.BIRTH_DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field3() {
		return com.evry.demo.entity.tables.Customer.CUSTOMER.BIRTH_NR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field4() {
		return com.evry.demo.entity.tables.Customer.CUSTOMER.CREATED_DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return com.evry.demo.entity.tables.Customer.CUSTOMER.FIRSTNAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return com.evry.demo.entity.tables.Customer.CUSTOMER.LASTNAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field7() {
		return com.evry.demo.entity.tables.Customer.CUSTOMER.UPDATED_DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigInteger value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value2() {
		return getBirthDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value3() {
		return getBirthNr();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value4() {
		return getCreatedDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getFirstname();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getLastname();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value7() {
		return getUpdatedDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CustomerRecord value1(java.math.BigInteger value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CustomerRecord value2(java.sql.Timestamp value) {
		setBirthDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CustomerRecord value3(java.lang.Long value) {
		setBirthNr(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CustomerRecord value4(java.sql.Timestamp value) {
		setCreatedDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CustomerRecord value5(java.lang.String value) {
		setFirstname(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CustomerRecord value6(java.lang.String value) {
		setLastname(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CustomerRecord value7(java.sql.Timestamp value) {
		setUpdatedDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CustomerRecord values(java.math.BigInteger value1, java.sql.Timestamp value2, java.lang.Long value3, java.sql.Timestamp value4, java.lang.String value5, java.lang.String value6, java.sql.Timestamp value7) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached CustomerRecord
	 */
	public CustomerRecord() {
		super(com.evry.demo.entity.tables.Customer.CUSTOMER);
	}

	/**
	 * Create a detached, initialised CustomerRecord
	 */
	public CustomerRecord(java.math.BigInteger id, java.sql.Timestamp birthDate, java.lang.Long birthNr, java.sql.Timestamp createdDate, java.lang.String firstname, java.lang.String lastname, java.sql.Timestamp updatedDate) {
		super(com.evry.demo.entity.tables.Customer.CUSTOMER);

		setValue(0, id);
		setValue(1, birthDate);
		setValue(2, birthNr);
		setValue(3, createdDate);
		setValue(4, firstname);
		setValue(5, lastname);
		setValue(6, updatedDate);
	}
}
