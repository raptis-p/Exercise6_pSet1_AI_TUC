package cspSolving;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import cspModeling.CSP;
import cspModeling.Domain;
import cspModeling.Variable;








public class DomainRestoreInfo {
	private List<Pair> savedDomains;
	private HashSet<Variable> affectedVariables;
	private boolean emptyDomainObserved;

	public DomainRestoreInfo() {
		savedDomains = new ArrayList<Pair>();
		affectedVariables = new HashSet<Variable>();
	}

	public void clear() {
		savedDomains.clear();
		affectedVariables.clear();
	}

	public boolean isEmpty() {
		return savedDomains.isEmpty();
	}

	/**
	 * Stores the specified domain for the specified variable if a domain has
	 * not yet been stored for the variable.
	 */
	public void storeDomainFor(Variable var, Domain domain) {
		if (!affectedVariables.contains(var)) {
			savedDomains.add(new Pair(var, domain));
			affectedVariables.add(var);
		}
	}

	public void setEmptyDomainFound(boolean b) {
		emptyDomainObserved = b;
	}

	/**
	 * Can be called after all domain information has been collected to reduce
	 * storage consumption.
	 * 
	 * @return this object, after removing one hashtable.
	 */
	public DomainRestoreInfo compactify() {
		affectedVariables = null;
		return this;
	}

	public boolean isEmptyDomainFound() {
		return emptyDomainObserved;
	}

	public List<Pair> getSavedDomains() {
		return savedDomains;
	}

	public void restoreDomains(CSP csp) {
		for (Pair pair : getSavedDomains())
			csp.setDomain(pair.getVar(), pair.getDomain());
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		for (Pair pair : savedDomains)
			result.append(pair.getVar() + "=" + pair.getDomain() + " ");
		if (emptyDomainObserved)
			result.append("!");
		return result.toString();
	}
}