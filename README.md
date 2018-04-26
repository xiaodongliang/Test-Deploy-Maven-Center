# Test-Deploy-Maven-Center
to test how to deploy the project to Maven center

# Stepup
Follow the steps in the blog https://nearsoft.com/blog/deploying-to-maven-central/. 
 * Register account to use Open Source Software Repository Hosting [OSSRH](https://oss.sonatype.org/)
 * Register your group id by the [steps](https://issues.sonatype.org/secure/CreateIssue.jspa?issuetype=21&pid=10134).
 * After group id is ready, input it to the value of tag <groupid> of [pom.xml](pom.xml).
 * Install GPG/PGP and create a key, make a note with your password (gpg.passphrase). 
 * Add tags to [settings.xml](ocal%20setting%20file/settings.xml) with the OSSRH acount id & password and GPG/PGP password(gpg.passphrase) . ensure this file is vailable at ~./m2/ of your machine.
 * Ensure all values in the [pom.xml](pom.xml) are correct.
 * Follow the guidance of the blog to deploy
 * Wait for some hours to see it alive on http://search.maven.org/
 
