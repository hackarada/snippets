seen = set()
outfile = open("output.txt", "w")
for line in open("input.txt", "r"):
    if line not in seen:
        outfile.write(line)
        seen.add(line)
outfile.close()