def rev(p):
    a = p.split()
    print("words after split are:\n", a)
    b = [i[::-1] for i in a]
    print("reversed words are:\n", b)
    for i in b:
        c = ' '.join(b)
    print("reversed paragraph is:\n")
    return c


p = input("Enter a paragraph:\n")
print(rev(p))
