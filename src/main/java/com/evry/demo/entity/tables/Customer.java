/**
 * This class is generated by jOOQ
 */
package com.evry.demo.entity.tables;

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
public class Customer extends org.jooq.impl.TableImpl<com.evry.demo.entity.tables.records.CustomerRecord> {

	private static final long serialVersionUID = -761931247;

	/**
	 * The reference instance of <code>PMTDATA.CUSTOMER</code>
	 */
	public static final com.evry.demo.entity.tables.Customer CUSTOMER = new com.evry.demo.entity.tables.Customer();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.evry.demo.entity.tables.records.CustomerRecord> getRecordType() {
		return com.evry.demo.entity.tables.records.CustomerRecord.class;
	}

	/**
	 * The column <code>PMTDATA.CUSTOMER.ID</code>.
	 */
	public final org.jooq.TableField<com.evry.demo.entity.tables.records.CustomerRecord, java.math.BigInteger> ID = createField("ID", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(19).nullable(false), this, "");

	/**
	 * The column <code>PMTDATA.CUSTOMER.BIRTH_DATE</code>.
	 */
	public final org.jooq.TableField<com.evry.demo.entity.tables.records.CustomerRecord, java.sql.Timestamp> BIRTH_DATE = createField("BIRTH_DATE", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>PMTDATA.CUSTOMER.BIRTH_NR</code>.
	 */
	public final org.jooq.TableField<com.evry.demo.entity.tables.records.CustomerRecord, java.lang.Long> BIRTH_NR = createField("BIRTH_NR", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>PMTDATA.CUSTOMER.CREATED_DATE</code>.
	 */
	public final org.jooq.TableField<com.evry.demo.entity.tables.records.CustomerRecord, java.sql.Timestamp> CREATED_DATE = createField("CREATED_DATE", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>PMTDATA.CUSTOMER.FIRSTNAME</code>.
	 */
	public final org.jooq.TableField<com.evry.demo.entity.tables.records.CustomerRecord, java.lang.String> FIRSTNAME = createField("FIRSTNAME", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>PMTDATA.CUSTOMER.LASTNAME</code>.
	 */
	public final org.jooq.TableField<com.evry.demo.entity.tables.records.CustomerRecord, java.lang.String> LASTNAME = createField("LASTNAME", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>PMTDATA.CUSTOMER.UPDATED_DATE</code>.
	 */
	public final org.jooq.TableField<com.evry.demo.entity.tables.records.CustomerRecord, java.sql.Timestamp> UPDATED_DATE = createField("UPDATED_DATE", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * Create a <code>PMTDATA.CUSTOMER</code> table reference
	 */
	public Customer() {
		this("CUSTOMER", null);
	}

	/**
	 * Create an aliased <code>PMTDATA.CUSTOMER</code> table reference
	 */
	public Customer(java.lang.String alias) {
		this(alias, com.evry.demo.entity.tables.Customer.CUSTOMER);
	}

	private Customer(java.lang.String alias, org.jooq.Table<com.evry.demo.entity.tables.records.CustomerRecord> aliased) {
		this(alias, aliased, null);
	}

	private Customer(java.lang.String alias, org.jooq.Table<com.evry.demo.entity.tables.records.CustomerRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.evry.demo.entity.Pmtdata.PMTDATA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.evry.demo.entity.tables.records.CustomerRecord> getPrimaryKey() {
		return com.evry.demo.entity.Keys.SYS_C0011439;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.evry.demo.entity.tables.records.CustomerRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.evry.demo.entity.tables.records.CustomerRecord>>asList(com.evry.demo.entity.Keys.SYS_C0011439);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.evry.demo.entity.tables.Customer as(java.lang.String alias) {
		return new com.evry.demo.entity.tables.Customer(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.evry.demo.entity.tables.Customer rename(java.lang.String name) {
		return new com.evry.demo.entity.tables.Customer(name, null);
	}
}
