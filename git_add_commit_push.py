import os

os.system("git add --all .")
cmd = "git commit -m \'update\'"
os.system(cmd)
os.system("git push")

print "git push success"