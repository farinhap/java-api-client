/**
 * 
 */
package com.kiuwan.client.model.management.users;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@XmlRootElement
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccessControlConfigurationBean {

		public static final String MANAGE_APPLICATIONS = "MANAGE_APPLICATIONS";
		public static final String MANAGE_ALL_USERS = "MANAGE_ALL_USERS";
		public static final String MANAGE_MODELS = "MANAGE_MODELS";
		public static final String ASSIGNMENT_MODE_ADD = "ADD";
		public static final String ASSIGNMENT_MODE_DELETE = "DELETE";
		public static final String ASSIGNMENT_MODE_OVERWRITE = "OVERWRITE";
	
		private String assignmentMode;

		/**
		 * Indicates if override {@link UserGroup} config or not.
		 */
		private Boolean overrideUserGroupConfig = null;
		
		/**
		 * Management features to enable/disable.
		 */
		private Collection<String> managementFeatures = null;
		
		/**
		 * Portfolio roles.
		 */
		private Collection<PortfolioRoleBean> portfolioRoles = null;
		
		/**
		 * Application roles.
		 */
		private Collection<ApplicationRoleBean> applicationRoles = null;

		/**
		 * Business value roles.
		 */
		private Collection<BusinessValueRoleBean> businessValueRoles = null;

		/**
		 * Provider roles.
		 */
		private Collection<ProviderRoleBean> providerRoles = null;
		
		/**
		 * @return the overrideUserGroupConfig
		 */
		public Boolean getOverrideUserGroupConfig() {
			return overrideUserGroupConfig;
		}

		/**
		 * @param overrideUserGroupConfig the overrideUserGroupConfig to set
		 */
		public void setOverrideUserGroupConfig(Boolean overrideUserGroupConfig) {
			this.overrideUserGroupConfig = overrideUserGroupConfig;
		}

		/**
		 * @return the assignmentMode
		 */
		public String getAssignmentMode() {
			return assignmentMode;
		}

		/**
		 * @param assignmentMode the assignmentMode to set
		 */
		public void setAssignmentMode(String assignmentMode) {
			this.assignmentMode = assignmentMode;
		}

		/**
		 * @return the managementFeatures
		 */
		public Collection<String> getManagementFeatures() {
			return managementFeatures;
		}

		/**
		 * @param managementFeatures the managementFeatures to set
		 */
		public void setManagementFeatures(Collection<String> managementFeatures) {
			this.managementFeatures = managementFeatures;
		}

		/**
		 * @return the portfolioRoles
		 */
		public Collection<PortfolioRoleBean> getPortfolioRoles() {
			return portfolioRoles;
		}

		/**
		 * @param portfolioRoles the portfolioRoles to set
		 */
		public void setPortfolioRoles(Collection<PortfolioRoleBean> portfolioRoles) {
			this.portfolioRoles = portfolioRoles;
		}

		/**
		 * @return the applicationRoles
		 */
		public Collection<ApplicationRoleBean> getApplicationRoles() {
			return applicationRoles;
		}

		/**
		 * @param applicationRoles the applicationRoles to set
		 */
		public void setApplicationRoles(Collection<ApplicationRoleBean> applicationRoles) {
			this.applicationRoles = applicationRoles;
		}

		/**
		 * @return the businessValuePortfolioRoles
		 */
		public Collection<BusinessValueRoleBean> getBusinessValueRoles() {
			return businessValueRoles;
		}

		/**
		 * @param businessValueRoles the businessValueRoles to set
		 */
		public void setBusinessValueRoles(Collection<BusinessValueRoleBean> businessValueRoles) {
			this.businessValueRoles = businessValueRoles;
		}

		/**
		 * @return the providerRoles
		 */
		public Collection<ProviderRoleBean> getProviderRoles() {
			return providerRoles;
		}

		/**
		 * @param providerRoles the providerRoles to set
		 */
		public void setProviderRoles(Collection<ProviderRoleBean> providerRoles) {
			this.providerRoles = providerRoles;
		}
		
}
