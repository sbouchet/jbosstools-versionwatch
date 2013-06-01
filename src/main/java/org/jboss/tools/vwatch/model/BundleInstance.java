package org.jboss.tools.vwatch.model;

import java.util.ArrayList;
import java.util.List;

public class BundleInstance {
	String absolutePath;
	String fullName;
	Bundle bundle;
	Version version;
	String postfix;
	String md5;
	BundleType bundleType;	
	long size;
	List<Issue> issues = new ArrayList<Issue>();

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public List<Issue> getIssues() {
		return issues;
	}

	public void setIssues(List<Issue> issues) {
		this.issues = issues;
	}

	public Bundle getBundle() {
		return bundle;
	}

	public void setBundle(Bundle bundle) {
		this.bundle = bundle;
	}

	public Version getVersion() {
		return version;
	}

	public void setVersion(Version version) {
		this.version = version;
	}

	public String getPostfix() {
		return postfix;
	}

	public void setPostfix(String postfix) {
		this.postfix = postfix;
	}

	public BundleType getBundleType() {
		return bundleType;
	}

	public void setBundleType(BundleType bundleType) {
		this.bundleType = bundleType;
	}

	public String toString() {
		return bundle.getName() + "," + version.toString();
	}

	public String getErrorsAndWarnings() {
		String ret = "";
		for (Issue i : getIssues()) {
			ret += i.getSeverityStr() + ":" + i.getMessage() + "&#10;";
		}
		return ret;
	}

	public int getMaxSeverity() {
		int ret = 0;
		for (Issue i : issues) {
			ret = Math.max(ret, i.getSeverity());
		}
		return ret;
	}

	public String getMd5() {
		return md5;
	}

	public void setMd5(String md5) {
		this.md5 = md5;
	}

	public String getAbsolutePath() {
		return absolutePath;
	}

	public void setAbsolutePath(String absolutePath) {
		this.absolutePath = absolutePath;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}
	
	
}
