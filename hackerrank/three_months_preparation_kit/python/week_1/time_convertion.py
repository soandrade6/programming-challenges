def timeConversion(s):
    if s[0:2] != "12" and s[-2:] == "PM":
        hr = int(s[0:2]) + 12
        return f'{str(hr)}{s[2:-2]}'
    elif s[0:2] == "12" and s[-2:] == "AM":
        return f'00{s[2:-2]}'
    else:
        return s[0:-2]

