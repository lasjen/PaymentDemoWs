/**
 * This class is generated by jOOQ
 */
package com.evry.demo.entity.packages;

/**
 * Convenience access to all stored procedures and functions in PMT_GRANT
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.3"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PmtGrant extends org.jooq.impl.PackageImpl {

	private static final long serialVersionUID = -1372678609;

	/**
	 * The reference instance of <code>PMTDATA.PMT_GRANT</code>
	 */
	public static final com.evry.demo.entity.packages.PmtGrant PMT_GRANT = new com.evry.demo.entity.packages.PmtGrant();

	/**
	 * Call <code>PMTDATA.PMT_GRANT.GRANTTOROLES</code>
	 */
	public static void granttoroles(org.jooq.Configuration configuration) {
		com.evry.demo.entity.packages.pmt_grant.Granttoroles p = new com.evry.demo.entity.packages.pmt_grant.Granttoroles();

		p.execute(configuration);
	}

	/**
	 * No further instances allowed
	 */
	private PmtGrant() {
		super("PMT_GRANT", com.evry.demo.entity.Pmtdata.PMTDATA);
	}
}