println "Pipeline Started"

println "Stage: Git checkout"

def branch = "main"
def repo = "https://github.com/pokemon-uc/DEVOPS-6B.git"

println "Cloning branch: ${branch}"
println "Repository: ${repo}"

println "Git checkout completed"

println "Pipeline Finished"