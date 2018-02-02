import os

os.system("git add --all .")
cmd = "git commit -m \'update\'"
os.system(cmd)
os.system("cp ../LeetCodePro/src/LeetCode_*.java .")
os.system("git add --all .")
cmd = "git commit -m \'update\'"
os.system(cmd)
os.system("git push")

print "git push success"
