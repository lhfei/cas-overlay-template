/*
 * Copyright 2010-2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package snippet;

public class Snippet {
	screen.welcome.welcome=Congratulations on bringing CAS online!  To learn how to authenticate, please review the default authentication handler configuration.
	screen.welcome.security=For security reasons, please <a href="logout">log out</a> and exit your web browser when you are done accessing \
	  services that require authentication!
	screen.welcome.instructions=Enter your Username and Password
	screen.welcome.label.netid=<span class="accesskey">U</span>sername:
	screen.welcome.label.netid.accesskey=u
	screen.welcome.label.password=<span class="accesskey">P</span>assword:
	screen.welcome.label.password.accesskey=p
	screen.welcome.label.publicstation=I am at a public workstation.
	screen.welcome.label.warn=<span class="accesskey">W</span>arn me!
	screen.welcome.label.warn.accesskey=w
	screen.welcome.label.warnremove=Do not warn me again
	screen.welcome.button.login=LOGIN
	screen.welcome.button.logout=LOGOUT
	screen.welcome.button.loginwip=One moment please...
	screen.welcome.button.register=Register
	screen.welcome.button.print=Print
	screen.welcome.button.clear=CLEAR
	screen.welcome.label.loginwith=Or login with:
	
	screen.cookies.disabled.title=Browser cookies disabled
	screen.cookies.disabled.message=Your browser does not accept cookies. Single Sign On WILL NOT WORK.
	
	screen.pm.button.submit=SUBMIT
	screen.pm.button.cancel=CANCEL
	screen.pm.button.forgotpwd=<a href="https://pwd.example.org">Forgot your password? </a>
	screen.pm.button.resetPassword=Reset your password
	screen.pm.reset.username=Username:
	screen.pm.reset.heading=Password Reset Failed
	screen.pm.reset.message=We were unable to process your password reset request at this time.
	screen.pm.reset.qstitle=Answer Security Questions
	screen.pm.reset.qsmsg=Welcome <strong>{0}</strong>. Before you can reset your password, you must answer the following security questions.
	screen.pm.reset.sentInstructions=You should shortly receive an email with follow-instructions to reset your password. Please do not take \
	  long as the password reset instructions may expire.
	screen.pm.reset.sent=Password Reset Instructions Sent Successfully.
	screen.pm.reset.title=Reset your password
	screen.pm.reset.instructions=Please provide your username. You will receive an email with follow-up instructions on how to reset \
	  your password.
	screen.aup.button.accept=ACCEPT
	screen.aup.button.cancel=CANCEL
	
	screen.consent.confirm=CONFIRM
	screen.consent.cancel=CANCEL
	
	screen.consent.title=Attribute Consent
	
	screen.nonsecure.title=Non-secure Connection
	screen.nonsecure.message=You are currently accessing CAS over a non-secure connection. Single Sign On WILL NOT WORK. In order to have single sign on work, you MUST log in over HTTPS.
	
	screen.defaultauthn.title=Static Authentication
	screen.defaultauthn.heading=CAS is configured to accept a static list of users for primary authentication. Please be advised that this is ONLY useful for demo purposes.
	
	logo.title=go to YSAS home page
	copyright=Copyright &copy; 2016&ndash;2017 Joybuy.com. All Rights Reserved
	screen.capslock.on = CAPSLOCK key is turned on!
	screen.button.continue=Continue
	screen.post.response.message=You are being redirected to {0}.
	
	# Remember-Me Authentication
	screen.rememberme.checkbox.title=Remember Me
	
	# Gua
	screen.gua.confirm.message=If you do not recognize this image as yours, do NOT continue.
	
	# Blocked Errors Page
	screen.blocked.header=Access Denied
	screen.blocked.message=You've entered the wrong password for the user too many times. You've been throttled.
	AbstractAccessDecisionManager.accessDenied=You are not authorized to access this resource. Contact your CAS administrator for more info.
	
	#Confirmation Screen Messages
	screen.confirmation.message=You asked to be warned before logging into applications. Please proceed.
	screen.authentication.warning=Authentication Succeeded with Warnings
	
	#Generic Success Screen Messages
	screen.success.header=Log In Successful
	screen.success.success=You, <strong>{0}</strong>, have successfully logged into the Central Authentication Service. However, you are seeing \
	  this page because CAS does not know about your target destination and how to get you there. Examine the authentication request again and \
	  make sure a target service/application that is authorized and registered with CAS is specified.
	screen.success.security=When you are finished, for security reasons, please <a href="logout">log out</a> and exit your web browser.
	
	#Logout Screen Messages
	screen.logout.confirm.header=Do you want to log out completely? 
	screen.logout.confirm.text=An application may have redirected you to the Central Authentication Service \
	  to completely log you out and destroy your single sign-on session. If you choose to log out, you will be asked again \
	  to provide your credentials and re-autheticate once you attempt to access an application.<p><p><br>Do you want to proceed? 
	
	screen.logout.header=Logout successful
	screen.logout.success=You have successfully logged out of the Central Authentication Service. You may <a href="login">log in</a> again. 
	screen.logout.fc.success=You have successfully logged out of the Central Authentication Service. Given single logout is enabled with CAS, \
	  the following list of applications are <strong> only notified</strong> to log you out and destroy your user session. Remember that this \
	  is just a notification, not a guarantee. It is up the application itself to honor these notifications and properly take action to log you \
	  out.
	screen.logout.security=For security reasons, exit your web browser.
	screen.logout.redirect=The service from which you arrived has supplied a <a href="{0}">link you may follow by clicking here</a>.
	
	screen.service.sso.error.header=Re-Authentication Required to Access this Service
	screen.service.sso.error.message=You attempted to access a service that requires authentication without re-authenticating.  Please try authenticating again</a>.
	screen.service.required.message=You attempted authentication without specifying the target application. Please re-examine the request and try again.
	        
	captchaError=reCAPTCHA validation failed.
	username.required=Username is a required field.
	password.required=Password is a required field.
	
	# Password Management
	confirmedPassword.required=Password must be confirmed.
	pm.passwordsMustMatch=Provided passwords do not match.
	pm.passwordFailedCriteria=Provided password does not satisfy the password security policy. Please try again.
	pm.updateFailure=Account password could not be modified. Please try again.
	
	# Authentication failure messages
	authenticationFailure.AccountDisabledException=This account has been disabled.
	authenticationFailure.AccountLockedException=This account has been locked.
	authenticationFailure.CredentialExpiredException=Your password has expired.
	authenticationFailure.InvalidLoginLocationException=You cannot login from this workstation.
	authenticationFailure.InvalidLoginTimeException=Your account is forbidden to login at this time.
	authenticationFailure.AccountNotFoundException=Invalid credentials.
	authenticationFailure.FailedLoginException=Invalid credentials.
	authenticationFailure.AccountPasswordMustChangeException=Your account password has expired and must be changed.
	authenticationFailure.UnauthorizedServiceForPrincipalException=Service access denied due to missing privileges.
	authenticationFailure.UNKNOWN=Invalid credentials.
	authenticationFailure.AuthenticationException=Credentials are rejected/invalid and authentication attempt has failed. 
	
	INVALID_REQUEST_PROXY=The request is incorrectly formatted. Ensure all required parameters are properly encoded and included.
	INVALID_TICKET_SPEC=Ticket failed validation specification. Possible errors could include attempting to validate a Proxy Ticket via a Service Ticket validator, or not complying with the renew true request.
	INVALID_REQUEST=service and ticket parameters are both required
	INVALID_AUTHENTICATION_CONTEXT=The validation request for [''{0}''] cannot be satisfied. The request is either unrecognized or unfulfilled.
	INVALID_TICKET=Ticket ''{0}'' not recognized
	INVALID_PROXY_GRANTING_TICKET=PGT already generated for this ST. Cannot grant more than one PGT for ST
	INVALID_SERVICE=Ticket ''{0}'' does not match supplied service. The original service was ''{1}'' and the supplied service was ''{2}''.
	INVALID_PROXY_CALLBACK=The supplied proxy callback url ''{0}'' could not be authenticated. Either ''{0}'' cannot be reached, it is not \
	  allowed to exercise proxy authentication.
	UNAUTHORIZED_SERVICE_PROXY=The supplied service ''{0}'' is not authorized to use CAS proxy authentication.
	UNSATISFIED_AUTHN_POLICY=Service access denied due to an unsatisfied authentication policy.
	
	screen.service.error.header=Application Not Authorized to Use CAS
	service.not.authorized.missing.attr=You are not authorized to access the application as your account \
	is missing privileges required by the CAS server to authenticate into this service. Please notify your support desk.
	screen.service.error.message=The application you attempted to authenticate to is not authorized to use CAS. \
	  Contact your CAS administrator to learn how you might register and integrate your application with CAS.
	screen.service.empty.error.message=The services registry of CAS is empty and has no service definitions. \
	Applications that wish to authenticate with CAS must explicitly be defined in the services registry.
	
	# Password policy
	password.expiration.warning=Your password expires in {0} day(s). Please <a href="{1}">change your password</a> now.
	password.expiration.loginsRemaining=You have {0} login(s) remaining before you <strong>MUST</strong> change your password.
	screen.accountdisabled.heading=This account has been disabled.
	screen.accountdisabled.message=Please contact the system administrator to regain access.
	screen.accountlocked.heading=This account has been locked.
	screen.accountlocked.message=Please contact the system administrator to regain access.
	screen.expiredpass.heading=Your password has expired.
	screen.expiredpass.message=Please <a href="https://changepsw.exampple.org">change your password</a>.
	screen.mustchangepass.heading=You must change your password.
	screen.mustchangepass.message=Please <a href="https://changepsw.exampple.org">change your password</a>.
	screen.badhours.heading=Your account is forbidden to login at this time.
	screen.badhours.message=Please try again later.
	screen.authnblocked.heading=Authentication attempt is blocked.
	screen.authnblocked.message=Your authentication attempt is untrusted and unauthorized from your current workstation.
	screen.risk.authnblocked.heading=Authentication attempt is blocked.
	screen.risk.authnblocked.message=Your authentication attempt is untrusted and unauthorized from your current workstation.
	screen.badworkstation.heading=You cannot login from this workstation.
	screen.badworkstation.message=Please contact the system administrator to regain access.
	
	screen.pm.success.header=Password Change Successful
	screen.pm.success.message=Your account password is successfully updated.
	
	screen.pm.confirmpsw=Confirm Password:
	screen.pm.enterpsw=Enter Password:
	
	screen.pac4j.unauthz.pagetitle=Unauthorized Access
	screen.pac4j.unauthz.gotoapp=Goto Application
	screen.pac4j.unauthz.login=Back to CAS
	screen.pac4j.unauthz.heading=Unauthorized Access
	screen.pac4j.unauthz.message=Either the authentication request was rejected/cancelled, or the authentication provider denied access due \
	  to permissions, etc. Review logs to find the root cause of the issue.
	
	# GAuth
	screen.authentication.gauth.register=Your account is not registered. Use the below settings to register your device with CAS.
	screen.authentication.gauth.key=Secret key to register is {0}
	
	# OAuth
	screen.oauth.confirm.header=Authorization
	screen.oauth.confirm.message=Do you want to grant access to "{0}" ?
	screen.oauth.confirm.allow=Allow
	screen.oauth.confirm.deny=Deny
	cas.oauth.confirm.pagetitle=Approve Access
	
	# OIDC
	screen.oidc.confirm.infourl=Learn more about {0}.
	screen.oidc.confirm.privacyurl=Learn about {0} privacy rules.
	
	screen.oidc.confirm.scope.profile=This requests access to the profile claims excluding the address and email claims.
	screen.oidc.confirm.scope.email=This requests access to the email claims.
	screen.oidc.confirm.scope.address=This requests access to the address claims.
	screen.oidc.confirm.scope.openid=This indicates an OpenID Connect authorization request.
	screen.oidc.confirm.scope.phone=This requests access to the phone claims.
	screen.oidc.confirm.scope.offline_access=This requests access for a refresh token used for offline access.
	
	screen.oidc.confirm.asksinfo=The client is asked for the following information:
	screen.oidc.confirm.dynamic=This client was dynamically registered at <code>{0}</code>.
	
	# Unavailable
	screen.unavailable.heading=CAS is unable to process this request: "{0}:{1}"
	screen.unavailable.message=There was an error trying to complete your request. \
	<strong>Please notify your support desk or try again.</strong> \
	<div>Apereo is a non-profit open source software governance foundation. The CAS software is an Apereo sponsored project \
	and is freely downloadable and usable by anyone. However, Apereo does not operate the systems of anyone using the \
	software and in most cases doesn't even know who is using it or how to contact them unless they are an active part \
	of the Apereo community.<br/></br>If you are having problems logging in using CAS, \
	<strong>you will need to contact the IT staff or Help Desk of your organization for assistance</strong>. \
	<br/><br/>We wish we could be more directly helpful to you.</div>
	
	#####################################################################
	# SSO Sessions View
	#####################################################################
	# No sessions found screen
	cas.ssosessions.loading=Loading SSO Sessions...
	cas.ssosessions.nosessionsfound=No sessions found. 
	cas.ssosessions.button.refresh=Refresh Page
	        
	# Report View
	cas.ssosessions.report.pagetitle=SSO Sessions Report
	cas.ssosessions.report.panel.totalactiveprincipals=Total Active Principals
	cas.ssosessions.report.panel.usagecountsessions=Usage Count Sessions
	cas.ssosessions.report.panel.totalssosessions=Total SSO Sessions
	
	cas.ssosessions.buttons.removeall=Remove All Sessions
	
	cas.ssosessions.buttons.filter.all=All
	cas.ssosessions.buttons.filter.proxied=Proxied
	cas.ssosessions.buttons.filter.nonproxied=Non-Proxied
	
	cas.ssosessions.table.header.principal=Principal
	cas.ssosessions.table.header.ticketgrantingticket=Ticket Granting Ticket
	cas.ssosessions.table.header.authenticationdate=Authentication Date
	cas.ssosessions.table.header.usagecount=Usage Count
	
	
	# Remove Session AJAX messages
	cas.sessions.ajax.error=There appears to be an error. Please try your request again.
	
	#####################################################################
	# Statistics View
	#####################################################################
	# Ticket Registry Section
	cas.statistics.pagetitle=Statistics View
	cas.statistics.loading=Loading...
	cas.statistics.section.ticket.title=Ticket Statistics
	cas.statistics.section.ticket.panel.unexpiredtgts.title=Unexpired TGTs
	cas.statistics.section.ticket.panel.unexpiredsts.title=Unexpired STs
	cas.statistics.section.ticket.panel.expiredtgts.title=Expired TGTs
	cas.statistics.section.ticket.panel.expiredsts.title=Expired STs
	cas.statistics.section.ticket.button=View SSO Sessions
	
	# JVM Section
	cas.statistics.section.serverstatistics.title=JVM Server Statistics
	
	## memory gauges
	cas.statistics.section.serverstatistics.freememorygauge.label=Total JVM Memory
	cas.statistics.section.serverstatistics.maxmemorygauge.label=Max Memory
	
	## Uptime
	cas.statistics.section.serverstatistics.panel.uptime.title=Uptime
	
	## Server Info
	cas.statistics.section.serverstatistics.panel.serverinfo.title=Server Info
	cas.statistics.section.serverstatistics.panel.serverinfo.table.property.label=Property
	cas.statistics.section.serverstatistics.panel.serverinfo.table.value.label=Value
	
	## Property Names
	cas.statistics.section.serverstatistics.panel.serverinfo.table.property.server.label=Server
	cas.statistics.section.serverstatistics.panel.serverinfo.table.property.casticketsuffix.label=CAS Ticket Suffix
	cas.statistics.section.serverstatistics.panel.serverinfo.table.property.starttime.label=Server Start Time
	cas.statistics.section.serverstatistics.panel.serverinfo.table.property.uptime.label=Uptime
	cas.statistics.section.serverstatistics.panel.serverinfo.table.property.memory.label=Memory
	cas.statistics.section.serverstatistics.panel.serverinfo.table.property.free=free
	cas.statistics.section.serverstatistics.panel.serverinfo.table.property.total=total
	cas.statistics.section.serverstatistics.panel.serverinfo.table.property.maxmemory.label=Maximum Memory
	cas.statistics.section.serverstatistics.panel.serverinfo.table.property.availprocessors.label=Available Processors
	
	##
	## End Statistics View
	#####################################################################
	
	
	
	#####################################################################
	# Logging Dashboard View
	#####################################################################
	## General
	cas.loggingdashboard.title=Logging Dashboard
	cas.loggingdashboard.warning=Modifications applied to the logging configuration are not persisted, and will be lost upon server restarts.
	cas.loggingdashboard.loading=Reading logging configuration
	cas.loggingdashboard.loading.error=Error loading log configuration. Please try again.
	cas.loggingdashboard.button.refresh=Refresh
	cas.loggingdashboard.configuration=Configuration
	cas.loggingdashboard.loggers=Loggers
	cas.loggingdashboard.logger=Logger
	cas.loggingdashboard.state=State
	cas.loggingdashboard.additive=Additive
	cas.loggingdashboard.level=Level
	
	## Log Levels
	cas.loggingdashboard.level.off=OFF
	cas.loggingdashboard.level.fatal=FATAL
	cas.loggingdashboard.level.error=ERROR
	cas.loggingdashboard.level.warn=WARN
	cas.loggingdashboard.level.info=INFO
	cas.loggingdashboard.level.debug=DEBUG
	cas.loggingdashboard.level.trace=TRACE
	cas.loggingdashboard.level.all=ALL
	
	cas.loggingdashboard.activeloggers=Active Loggers
	cas.loggingdashboard.state.on=On
	cas.loggingdashboard.state.off=Off
	cas.loggingdashboard.state.enabled=Enabled
	cas.loggingdashboard.state.disabled=Disabled
	
	
	
	
	##
	## End Logging Dashboard View
	#####################################################################
	
	#####################################################################
	# Configuration View
	#####################################################################
	# Error loading screen
	cas.viewconfig.loading=Loading Configuration...
	cas.viewconfig.persistence=Changes to application configuration are applied immediately, though at this time they are only persisted in runtime memory \
	  and last for as long as the CAS server is up and running. Be sure to apply any and all \
	  changes directly to the underlying configuration if you wish for them to stay with you through server restarts.
	cas.viewconfig.errormessage=Error reading configuration
	cas.viewconfig.button.refresh=Refresh
	
	# Report View
	cas.viewconfig.pagetitle=View CAS Configuration
	cas.viewconfig.table.column.key=Setting
	cas.viewconfig.table.column.value=Value
	
	##
	## End Configuration View
	#####################################################################
	
	#####################################################################
	# Dashboard View
	#####################################################################
	cas.dashboard.pagetitle=Dashboard View
	cas.dashboard.loading=Loading...
	cas.dashboard.section.dashboard.title=CAS Dashboard
	cas.dashboard.section.configuration.title=Configuration Profiles
	cas.dashboard.section.server.functions.title=Server Functions
	cas.dashboard.action.button.refresh=Reload CAS Application Context
	cas.dashboard.action.button.refresh.modal.title=Refreshing CAS Configuration server to pick up changes to properties and settings.
	cas.dashboard.action.button.refresh.modal.message=The server is refreshing your changes. Please give it a few minutes and refresh the page.
	
	cas.dashboard.action.button.reboot=Reboot
	cas.dashboard.action.button.reboot.modal.title=Rebooting Server
	cas.dashboard.action.button.reboot.modal.message=The server is rebooting. Please give it a few minutes and refresh the page.
	
	cas.dashboard.action.button.shutdown=Shutdown
	cas.dashboard.action.button.shutdown.modal.title=Shutdown Server
	cas.dashboard.action.button.shutdown.modal.message=The server will shut down. You will need to manually restart it.
	
	cas.dashboard.tooltip.autoconfiguration=Displays an auto-configuration report showing all auto-configuration candidates and the reason why they ‘were’ or ‘were not’ applied.
	cas.dashboard.tooltip.beans=Displays a complete list of all the Spring beans in your application.
	cas.dashboard.tooltip.mappings=Displays a collated list of all request mapping paths.
	cas.dashboard.tooltip.configprops=Displays a collated list of all configuration properties.
	cas.dashboard.tooltip.trace=Displays trace information (by default the last 100 HTTP requests).
	cas.dashboard.tooltip.metrics=Shows ‘metrics’ information for the CAS application
	cas.dashboard.tooltip.info=Displays CAS application info.
	cas.dashboard.tooltip.attrresolution=Allows CAS administrators to resolve and examine attributes associated with a given CAS principal.
	cas.dashboard.tooltip.health=Shows application health information (when the application is secure, a simple ‘status’ when accessed over an unauthenticated connection or full message details when authenticated).
	cas.dashboard.tooltip.env=Exposes properties from Spring container’s environment.
	cas.dashboard.tooltip.dump=Performs a thread dump.
	cas.dashboard.tooltip.status=Performs a health check on CAS configured monitors and provides status.
	cas.dashboard.tooltip.stats=Reports back ticket statistics and memory stats.
	cas.dashboard.tooltip.configpanel=Control and configure CAS settings and properties.
	cas.dashboard.tooltip.logging=Configure the CAS logging machinery and auto-monitor logs.
	cas.dashboard.tooltip.ssostatus=Reports whether the CAS server still maintains an active single sign-on status for this session.
	cas.dashboard.tooltip.ssosessions=Display and control the current active SSO sessions.
	cas.dashboard.tooltip.authnevents=Reports back a listing of authentication events that have commenced
	cas.dashboard.tooltip.trusteddevs=Shows a listing of current registered and trusted devices, relevant to multifactor authentication.
	cas.dashboard.tooltip.swf=Shows the current collection of Spring Webflow states, actions, flows and transitions.
	
	#####################################################################
	# Login View
	#####################################################################
	#Resources Labels
	cas.login.pagetitle=Login
	cas.login.resources.header=Links to CAS Resources
	cas.login.resources.wiki=Documentation
	cas.login.resources.issuetracker=Issue Tracker
	cas.login.resources.mailinglist=Mailing Lists
	cas.login.resources.chat=Chatroom
	cas.login.resources.blog=Blog
	cas.login.resources.dashboard=Dashboard
	
	####
	# Acceptable Usage Policy View
	#
	cas.acceptableusagepolicyview.pagetitle=Acceptable Usage Policy View
	
	####
	# Attribute Resolution View
	#
	cas.attrresolutionview.pagetitle=Attribute Resolution
	cas.attrresolutionview.label.uid=Username:
	cas.attrresolutionview.button.submit=SUBMIT
	
	##
	# MFA
	##
	cas.mfa.duologin.pagetitle=DuoSecurity Login
	cas.mfa.googleauth.pagetitle=Google Authenticator
	cas.mfa.googleauth.label.token=Token:
	cas.mfa.azure.pagetitle=Microsoft Authenticator
	cas.mfa.radius.pagetitle=Radius Authentication
	cas.mfa.yubikey.pagetitle=YubiKey Authentication
	cas.mfa.u2f.pagetitle=U2F Authentication
	cas.mfa.authy.pagetitle=Authy Login
	
	cas.mfa.registerdevice.label.title=Register Device
	cas.mfa.registerdevice.label.intro=Please name the current device. 
	cas.mfa.registerdevice.pagetitle=Register Device
	cas.mfa.registerdevice.label.name=Name
	cas.mfa.registerdevice.button.register=Register
	
}

/**
 * @version 0.1
 *
 * @author Hefei Li
 *
 * @since Oct 10, 2017
 */

