package nl.devon.cucumber.sample_apps.banking.domain;

import java.util.ArrayList;
import java.util.List;

import nl.devon.DelayedVerification;
import nl.devon.DelayedVerificationStore;

public class DomainModel implements DelayedVerificationStore {

	private String creditor;
	private String debtor;
	private String amount;
	private String status;
	private List<String> logEntries = new ArrayList<String>();

	public String getCreditor() {
		return creditor;
	}

	public void setCreditor(String creditor) {
		this.creditor = creditor;
	}

	public String getDebtor() {
		return debtor;
	}

	public void setDebtor(String debtor) {
		this.debtor = debtor;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<String> getLogEntries() {
		return logEntries;
	}

	public void addLog(String entry) {
		logEntries.add(entry);
	}

	public void save(DelayedVerification verification) {
		// TODO Auto-generated method stub

	}

	public DelayedVerification load(String dvId) {
		// TODO Auto-generated method stub
		return null;
	}
}
