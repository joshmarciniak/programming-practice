def main():
    f1 = input("Enter a filename: ").strip()

    infile = open(f1, "r")

    s=infile.read()

    print(str(len(s)) + " characters")
    print(str(len(s.split())) + " words")
    print(str(len(s.split('\n'))) + " lines")

    infile.close()

main()
