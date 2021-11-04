# Oblig2
har lagd 2 workflow filer en maven.yml som bygger prosjektet og en junit-testing som kjører testene i "MainTest" og i "ValidateNumberTest" 
maven.yml står for "Java CI with Maven" i actions tabben og bygger prosjektet hver gang noen forandringer blir en push\pull request i Main branchen
junit testing filen bruker maven surefire til og kjøre testene og forteller oss om noen av de feiler.

