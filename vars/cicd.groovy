def newgit(repo)
{
git "https://github.com/intelliqittrainings/${repo}"
}
def newmaven()
{
sh 'mvn package'
}
