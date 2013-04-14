/**
 * Created on April 13, 2013
 */
package com.chainmeans.poc.swf.web.view;

import java.io.Serializable;
import java.util.List;

import com.chainmeans.poc.swf.domain.Nexus;

/**
 * @author Roberto
 *
 */
public class NexusListBean implements Serializable {

	private List<Nexus> nexus;
	
	private Nexus selectedNexus;

	public List<Nexus> getNexus() {
		return nexus;
	}

	public void setNexus(List<Nexus> nexus) {
		this.nexus = nexus;
	}

	public Nexus getSelectedNexus() {
		return selectedNexus;
	}

	public void setSelectedNexus(Nexus selectedNexus) {
		this.selectedNexus = selectedNexus;
	}
	
}
