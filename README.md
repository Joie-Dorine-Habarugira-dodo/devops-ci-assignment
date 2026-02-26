# Part 1
```
hp@Dorine MINGW64 ~
$ mkdir devops-ci-assignment

hp@Dorine MINGW64 ~
$ cd devops-ci-assignment

hp@Dorine MINGW64 ~/devops-ci-assignment
$ git init
Initialized empty Git repository in C:/Users/hp/devops-ci-assignment/.git/

hp@Dorine MINGW64 ~/devops-ci-assignment (master)
$ git branch -M main

hp@Dorine MINGW64 ~/devops-ci-assignment (main)
$ git branch

hp@Dorine MINGW64 ~/devops-ci-assignment (main)
$ git config --global user.name "Joie-Dorine-Habarugira-dodo"

hp@Dorine MINGW64 ~/devops-ci-assignment (main)
$ git config --global user.email "hjoydoreen08@gmail.com"

hp@Dorine MINGW64 ~/devops-ci-assignment (main)
$ git config --list
diff.astextplain.textconv=astextplain
filter.lfs.clean=git-lfs clean -- %f
filter.lfs.smudge=git-lfs smudge -- %f
filter.lfs.process=git-lfs filter-process
filter.lfs.required=true
http.sslbackend=openssl
http.sslcainfo=C:/Program Files/Git/mingw64/etc/ssl/certs/ca-bundle.crt
core.autocrlf=true
core.fscache=true
core.symlinks=false
pull.rebase=false
credential.helper=manager
credential.https://dev.azure.com.usehttppath=true
init.defaultbranch=master
user.name=Joie-Dorine-Habarugira-dodo
user.email=hjoydoreen08@gmail.com
core.editor=code --wait
core.repositoryformatversion=0
core.filemode=false
core.bare=false
core.logallrefupdates=true
core.symlinks=false
core.ignorecase=true
```

# Part 2

```
hp@Dorine MINGW64 ~/devops-ci-assignment (main)
$ git remote add origin https://github.com/Joie-Dorine-Habarugira-dodo/devops-ci-assignment.git

hp@Dorine MINGW64 ~/devops-ci-assignment (main)
$ touch README.md

hp@Dorine MINGW64 ~/devops-ci-assignment (main)
$ git push -u origin main
error: src refspec main does not match any
error: failed to push some refs to 'https://github.com/Joie-Dorine-Habarugira-dodo/devops-ci-assignment.git'

hp@Dorine MINGW64 ~/devops-ci-assignment (main)
$ git branch

hp@Dorine MINGW64 ~/devops-ci-assignment (main)
$ git add .

hp@Dorine MINGW64 ~/devops-ci-assignment (main)
$ git commit -m "initial commit"
[main (root-commit) 5ac2a04] initial commit
 6 files changed, 90 insertions(+)
 create mode 100644 .idea/.gitignore
 create mode 100644 .idea/devops-ci-assignment.iml
 create mode 100644 .idea/misc.xml
 create mode 100644 .idea/modules.xml
 create mode 100644 .idea/vcs.xml
 create mode 100644 README.md

hp@Dorine MINGW64 ~/devops-ci-assignment (main)
$ git push -u origin main
Enumerating objects: 9, done.
Counting objects: 100% (9/9), done.
Delta compression using up to 12 threads
Compressing objects: 100% (9/9), done.
Writing objects: 100% (9/9), 1.81 KiB | 464.00 KiB/s, done.
Total 9 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
To https://github.com/Joie-Dorine-Habarugira-dodo/devops-ci-assignment.git
 * [new branch]      main -> main
branch 'main' set up to track 'origin/main'.

hp@Dorine MINGW64 ~/devops-ci-assignment (main)
$ git branch
* main
```
# Part 3

```
hp@Dorine MINGW64 ~/devops-ci-assignment (main)
$ git checkout -b dev
Switched to a new branch 'dev'

hp@Dorine MINGW64 ~/devops-ci-assignment (dev)
$ git push -u origin dev
Total 0 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
remote:
remote: Create a pull request for 'dev' on GitHub by visiting:
remote:      https://github.com/Joie-Dorine-Habarugira-dodo/devops-ci-assignment/pull/new/dev
remote:
To https://github.com/Joie-Dorine-Habarugira-dodo/devops-ci-assignment.git
 * [new branch]      dev -> dev
branch 'dev' set up to track 'origin/dev'.
```
# Part 4

```
hp@Dorine MINGW64 ~/devops-ci-assignment (dev)
$ git checkout -b test
Switched to a new branch 'test'

hp@Dorine MINGW64 ~/devops-ci-assignment (test)
$ git push -u origin test
Enumerating objects: 5, done.
Counting objects: 100% (5/5), done.
Delta compression using up to 12 threads
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 540 bytes | 540.00 KiB/s, done.
Total 3 (delta 1), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (1/1), completed with 1 local object.
remote:
remote: Create a pull request for 'test' on GitHub by visiting:
remote:      https://github.com/Joie-Dorine-Habarugira-dodo/devops-ci-assignment/pull/new/test
remote:
To https://github.com/Joie-Dorine-Habarugira-dodo/devops-ci-assignment.git
 * [new branch]      test -> test
branch 'test' set up to track 'origin/test'.

hp@Dorine MINGW64 ~/devops-ci-assignment (test)
$ git branch -a
  dev
  main
* test
  remotes/origin/dev
  remotes/origin/main
  remotes/origin/test

hp@Dorine MINGW64 ~/devops-ci-assignment (test)
$ git checkout dev
Switched to branch 'dev'
Your branch is ahead of 'origin/dev' by 1 commit.
  (use "git push" to publish your local commits)

hp@Dorine MINGW64 ~/devops-ci-assignment (dev)
$ git branch -d test
Deleted branch test (was aa7a67e).

hp@Dorine MINGW64 ~/devops-ci-assignment (dev)
$ git push origin --delete test
To https://github.com/Joie-Dorine-Habarugira-dodo/devops-ci-assignment.git
 - [deleted]         test
```

# Part 5
```
hp@Dorine MINGW64 ~/devops-ci-assignment (dev)
$ git checkout -b ft/setup
Switched to a new branch 'ft/setup'
```

# Part 6
```
hp@Dorine MINGW64 ~/devops-ci-assignment (ft/setup)
$ touch test.java

hp@Dorine MINGW64 ~/devops-ci-assignment (ft/setup)
$ git add test.java

hp@Dorine MINGW64 ~/devops-ci-assignment (ft/setup)
$ git commit -m "feat: add initial test.java"
[ft/setup e7ce6dc] feat: add initial test.java
 1 file changed, 6 insertions(+)
 create mode 100644 test.java
```
# Part 7
```
hp@Dorine MINGW64 ~/devops-ci-assignment (ft/setup)
$ git stash
Saved working directory and index state WIP on ft/setup: e7ce6dc feat: add initial test.java
```
# Part 8
```
hp@Dorine MINGW64 ~/devops-ci-assignment (ft/setup)
$ git stash list
stash@{0}: WIP on ft/setup: e7ce6dc feat: add initial test.java

hp@Dorine MINGW64 ~/devops-ci-assignment (ft/setup)
$ git stash pop stash@{0}
error: Your local changes to the following files would be overwritten by merge:
        README.md
Please commit your changes or stash them before you merge.
Aborting
On branch ft/setup
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   README.md

no changes added to commit (use "git add" and/or "git commit -a")
The stash entry is kept in case you need it again.
```
# Part 9
```
hp@Dorine MINGW64 ~/devops-ci-assignment (ft/setup)
$ git push -u origin ft/setup
Enumerating objects: 11, done.
Counting objects: 100% (11/11), done.
Delta compression using up to 12 threads
Compressing objects: 100% (9/9), done.
Writing objects: 100% (9/9), 1.44 KiB | 1.44 MiB/s, done.
Total 9 (delta 3), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (3/3), completed with 1 local object.
remote:
remote: Create a pull request for 'ft/setup' on GitHub by visiting:
remote:      https://github.com/Joie-Dorine-Habarugira-dodo/devops-ci-assignment/pull/new/ft/setup
remote:
To https://github.com/Joie-Dorine-Habarugira-dodo/devops-ci-assignment.git
 * [new branch]      ft/setup -> ft/setup
branch 'ft/setup' set up to track 'origin/ft/setup'.
```

# Part 10
```
hp@Dorine MINGW64 ~/devops-ci-assignment (ft/setup)
$ git checkout main
error: Your local changes to the following files would be overwritten by checkout:
        README.md
Please commit your changes or stash them before you switch branches.
Aborting

hp@Dorine MINGW64 ~/devops-ci-assignment (ft/setup)
$ git add README.md

hp@Dorine MINGW64 ~/devops-ci-assignment (ft/setup)
$ git stash
Saved working directory and index state WIP on ft/setup: e7ce6dc feat: add initial test.java

hp@Dorine MINGW64 ~/devops-ci-assignment (ft/setup)
$ git checkout main
Switched to branch 'main'
Your branch is up to date with 'origin/main'.

hp@Dorine MINGW64 ~/devops-ci-assignment (main)
$ touch test.java

hp@Dorine MINGW64 ~/devops-ci-assignment (main)
$ git add .

hp@Dorine MINGW64 ~/devops-ci-assignment (main)
$ git commit -m "feat: modify test.java in main branch"
[main 2b71cfb] feat: modify test.java in main branch
 1 file changed, 6 insertions(+)
 create mode 100644 test.java

hp@Dorine MINGW64 ~/devops-ci-assignment (main)
$ git push
Enumerating objects: 4, done.
Counting objects: 100% (4/4), done.
Delta compression using up to 12 threads
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 448 bytes | 448.00 KiB/s, done.
Total 3 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
To https://github.com/Joie-Dorine-Habarugira-dodo/devops-ci-assignment.git
   1cd08a8..2b71cfb  main -> main

hp@Dorine MINGW64 ~/devops-ci-assignment (main)
$ git checkout ft/setup
Switched to branch 'ft/setup'
Your branch is up to date with 'origin/ft/setup'.

hp@Dorine MINGW64 ~/devops-ci-assignment (ft/setup)
$ git merge main
Auto-merging test.java
CONFLICT (add/add): Merge conflict in test.java
Automatic merge failed; fix conflicts and then commit the result.

hp@Dorine MINGW64 ~/devops-ci-assignment (ft/setup|MERGING)
$ git add test.java

hp@Dorine MINGW64 ~/devops-ci-assignment (ft/setup|MERGING)
$ git commit -m "fix: resolve merge conflict between main and ft/setup"
[ft/setup 4234ac9] fix: resolve merge conflict between main and ft/setup

hp@Dorine MINGW64 ~/devops-ci-assignment (ft/setup)
$ git push
Enumerating objects: 4, done.
Counting objects: 100% (4/4), done.
Delta compression using up to 12 threads
Compressing objects: 100% (2/2), done.
Writing objects: 100% (2/2), 317 bytes | 317.00 KiB/s, done.
Total 2 (delta 1), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (1/1), completed with 1 local object.
To https://github.com/Joie-Dorine-Habarugira-dodo/devops-ci-assignment.git
   e7ce6dc..4234ac9  ft/setup -> ft/setup

```





```

```